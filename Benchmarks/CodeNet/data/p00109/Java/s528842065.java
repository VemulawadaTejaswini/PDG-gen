TERM_N  = 0
TERM_OP_PM = 1
TERM_OP_MD = 2
TERM_OP_SIGN = 3
TERM_LB = 4
TERM_RB = 5
TERM_END = 6

def lex_analyze(str)
  expr = []

  come_sign = true

  for t in str.scan(/\d+|[\+\-\*\/\(\)=]/)
    case t
      when '+', '-'
      if come_sign
        expr.push [TERM_OP_SIGN, t]
      else
        expr.push [TERM_OP_PM, t]
        come_sign = true
      end

      when '*', '/'
      expr.push [TERM_OP_MD, t]
      come_sign = true

      when '('
      expr.push [TERM_LB, t]
      come_sign = true

      when ')'
      expr.push [TERM_RB, t]
      come_sign = true

      when '='
      expr.push [TERM_END, t]
      come_sign = true

      else
      expr.push [TERM_N, t.to_i]
      come_sign = false
    end
  end

  return expr
end

def to_rpn(expr)
  rpn = []
  stack = []

  for t in expr
    case t[0]
      when TERM_N
      rpn.push t
      while ! stack.empty? && stack[-1][0] == TERM_OP_SIGN
        rpn.push stack.pop
      end

      when TERM_OP_PM
      while ! stack.empty? &&
          ((st = stack[-1])[0] == TERM_OP_PM || st[0] == TERM_OP_MD)
        rpn.push stack.pop
      end
      stack.push t

      when TERM_OP_MD
      while ! stack.empty? && stack[-1][0] == TERM_OP_MD
        rpn.push stack.pop
      end
      stack.push t

      when TERM_OP_SIGN
      stack.push t

      when TERM_LB
      stack.push t

      when TERM_RB
      while stack[-1][0] != TERM_LB
        rpn.push stack.pop
      end
      stack.pop
      while ! stack.empty? && stack[-1][0] == TERM_OP_SIGN
        rpn.push stack.pop
      end

      when TERM_END
      while ! stack.empty?
        rpn.push stack.pop
      end
    end
  end

  return rpn
end

def calc_rpn(rpn)
  stack = []

  for t in rpn
    if t[0] == TERM_N
      stack.push t[1]
    elsif t[0] == TERM_OP_SIGN
      if t[1] == '-'
        n1 = stack.pop
        stack.push -n1
      end
    else
      n2 = stack.pop
      n1 = stack.pop
      case t[1]
        when "+"
        stack.push(n1 + n2)
        when "-"
        stack.push(n1 - n2)
        when "*"
        stack.push(n1 * n2)
        when "/"
        stack.push(n1 / n2)
      end
    end
  end

  return stack[-1]
end

### main

n = gets.chomp.to_i

n.times.each do
  str = gets.chomp
  #p str
  expr = lex_analyze(str)
  #p expr
  rpn = to_rpn(expr)
  #p rpn
  num = calc_rpn(rpn)
  puts num
end