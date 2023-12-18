import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by S64 on 15/07/29.
 */


// ????§?: 1??????34???43?§?
// ??????: 0??????00???00?§? (????????????)
class Main {

    enum Logic {
        False,   // 0
        Unknown, // 1
        True,    // 2
    }

    enum Operator {
        Not, // -
        And, // *
        Or,  // +
    }

    static class FormulaPattern {

        public final Logic P;
        public final Logic Q;
        public final Logic R;

        public FormulaPattern(Logic p, Logic q, Logic r) {
            this.P = p;
            this.Q = q;
            this.R = r;
        }

    }

    public static void main(String _[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String line = in.readLine();
            if(line.equals("."))
                break;

            int trueCount = 0;
            int falseCount = 0;
            int unknownCount = 0;

            for(Logic p : Logic.values()) {
                for(Logic q : Logic.values()) {
                    for(Logic r : Logic.values()) {
                        FormulaPattern x = new FormulaPattern(p, q, r);
                        Logic result = Do(line.toCharArray(), x);

                        if(result == Logic.True)
                            trueCount++;
                        if(result == Logic.False)
                            falseCount++;
                        if(result == Logic.Unknown)
                            unknownCount++;
                    }
                }
            }

            System.out.println( String.format("%d", trueCount) );
            //System.out.println( String.format("  F: %d", falseCount) );
            //System.out.println( String.format("  U: %d", unknownCount) );
        }
    }

    static Logic Do(char[] line, FormulaPattern x) {
        return Do(line, 0, x);
    }

    static Logic Do(char[] line, int position, FormulaPattern pattern) {
        List<Operator> nextOperations = new ArrayList<Operator>();
        int previousValue = -1;

        for(int i = position; i < line.length ; i++) {
            char chr = line[i];

            if(chr == '(') {
                previousValue = (Do(line, i + 1, pattern)).ordinal();
                break;
            } else if(chr == ')') {
                break;
            }

            switch(chr) {
                case '-':
                    nextOperations.add(Operator.Not);
                    break;
                case '*':
                    nextOperations.add(Operator.And);
                    break;
                case '+':
                    nextOperations.add(Operator.Or);
                    break;
                case 'P':
                case 'Q':
                case 'R':
                case '0':
                case '1':
                case '2':
                    {
                        int val;
                        switch(chr) {
                            case 'P':
                                val = pattern.P.ordinal();
                                break;
                            case 'Q':
                                val = pattern.Q.ordinal();
                                break;
                            case 'R':
                                val = pattern.R.ordinal();
                                break;
                            default:
                                val = Integer.parseInt(String.valueOf(chr));
                                break;
                        }
                        for(Operator opr : nextOperations) {
                            switch(opr) {
                                case And:
                                    /*
                                    if(previousValue == Logic.Unknown.ordinal() || val == Logic.Unknown.ordinal())
                                        val = Logic.Unknown.ordinal();
                                    else if(previousValue == Logic.True.ordinal())
                                        if(val != Logic.True.ordinal())
                                            val = Logic.False.ordinal();
                                    else if(previousValue == Logic.False.ordinal())
                                            if(val != Logic.False.ordinal())
                                                val = Logic.True.ordinal();
                                    */
                                    if(previousValue == val)
                                        val = Logic.True.ordinal();
                                    else if(previousValue == Logic.Unknown.ordinal() || val == Logic.Unknown.ordinal())
                                        val = Logic.Unknown.ordinal();
                                    else
                                        val = Logic.False.ordinal();
                                    break;
                                case Or:
                                    /*
                                    if(previousValue == Logic.Unknown.ordinal() || val == Logic.Unknown.ordinal())
                                        val = Logic.Unknown.ordinal();
                                    else if(previousValue == Logic.True.ordinal() || val == Logic.True.ordinal())
                                        val = Logic.True.ordinal();
                                    else
                                        val = Logic.False.ordinal();
                                    */
                                    if(previousValue == Logic.True.ordinal() || val == Logic.True.ordinal())
                                        val = Logic.True.ordinal();
                                    else if(previousValue == Logic.Unknown.ordinal() || val == Logic.Unknown.ordinal())
                                        val = Logic.Unknown.ordinal();
                                    else
                                        val = Logic.False.ordinal();
                                    break;
                                case Not:
                                    if(val == Logic.True.ordinal())
                                        val = Logic.False.ordinal();
                                    else if(val == Logic.False.ordinal())
                                        val = Logic.True.ordinal();
                                    break;
                            }
                        }
                        nextOperations.clear();
                        {
                            previousValue = val;
                        }
                    }
                    break;
            }

        }

        return Logic.values()[ previousValue ];
    }


}