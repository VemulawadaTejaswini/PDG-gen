import java.util.*;
public class Main{

    void run(){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String exp = sc.next();
            try{
                Parser parser = new Parser(exp);
                System.out.println(parser.expression());
            }
            catch(MyOverFlowException e){
                System.out.println("overflow");
            }
        }
    }
    public static void main(String[] args){
        new Main().run();
    }
}
class Z{
    int re,im;
    Z(int re, int im){
        this.re = re;
        this.im = im;
    }
    Z add(Z z){
        return new Z(re + z.re, im + z.im);
    }
    Z sub(Z z){
        return new Z(re - z.re, im - z.im);
    }
    Z mul(Z z){
        return new Z(re * z.re - im * z.im, re * z.im + im * z.re);
    }
    public String toString(){
        if(re == 0 && im == 0){
            return "0";
        }
        if(im == 0){
            return re + "";
        }
        if(re == 0){
            return im + "i";
        }
        if(im > 0){
            return re + "+" + im + "i";
        }
        return re + "" + im + "i";
    }
}
class MyOverFlowException extends Exception{
    public MyOverFlowException(){
        super();
    }
}
class Parser{
    char[] exp;
    int begin;
    Parser(String str){
        this.exp = (str+"#").toCharArray();
    }
    //四則演算の式をパースして、その評価結果を返す
    Z expression() throws MyOverFlowException{
        Z ret = term();
        
        while(true){
            if(exp[begin] == '+'){
                begin++;
                ret = ret.add(term());
                if(Math.abs(ret.re) > 10000 || Math.abs(ret.im) > 10000){
                    throw new MyOverFlowException();
                }
            }
            else if(exp[begin] == '-'){
                begin++;
                ret = ret.sub(term());
                if(Math.abs(ret.re) > 10000 || Math.abs(ret.im) > 10000){
                    throw new MyOverFlowException();
                }
            }
            else{
                break;
            }
        }
        return ret;
    }
    //乗算除算の式をパースして、その評価結果を返す
    Z term() throws MyOverFlowException{
        Z ret = factor();
        while(true){
            if(exp[begin] == '*'){
                begin++;
                ret = ret.mul(factor());
                if(Math.abs(ret.re) > 10000 || Math.abs(ret.im) > 10000){
                    throw new MyOverFlowException();
                }
            }
            /*
            else if(exp[begin] == '/'){
                begin++;
                ret = ret.div(factor())
            }
            */
            else{
                break;
            }
        }
        return ret;
    }
    
    //数字の列をパースして、その数を返す
    Z number() throws MyOverFlowException{
        if(exp[begin] == 'i'){
            begin++;
            return new Z(0,1);
        }
        int ret = 0;
        while(Character.isDigit(exp[begin])){
            ret *= 10;
            ret += exp[begin] - '0';
            begin++;
        }
        if(ret > 10000){
            throw new MyOverFlowException();
        }
        return new Z(ret,0);
    }
    
    //括弧か数かをパースして、その評価結果を返す
    Z factor() throws MyOverFlowException{
        if(exp[begin] == '('){
            begin++;//'('を飛ばす
            Z ret = expression();
            begin++;//')'を飛ばす
            return ret;
        }
        else{
            return number();
        }
    }
}
//https://gist.github.com/draftcode/1357281