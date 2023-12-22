import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BigInteger A = scanner.nextBigInteger();
        BigInteger B = scanner.nextBigInteger();
        BigInteger C = scanner.nextBigInteger();
        BigInteger D = scanner.nextBigInteger();

        BigInteger countC = countDivNum(A, B, C);
        BigInteger countD = countDivNum(A, B, D);
        BigInteger countCD = countDivNum(A, B, lcm(C, D));

        BigInteger rangeNum = B.subtract(A).add(BigInteger.valueOf(1));
        BigInteger divideNum = countC.add(countD).subtract(countCD);

        System.out.println(rangeNum.subtract(divideNum));

    }

    private static BigInteger countDivNum(BigInteger A, BigInteger B, BigInteger Divide){


        BigInteger minValue = A;
        BigInteger[] valMin = minValue.divideAndRemainder(Divide);
        BigInteger minRemainder = valMin[1];
        if(!minRemainder.equals(BigInteger.valueOf(0))){
            BigInteger diff = Divide.subtract(minRemainder);
            minValue = minValue.add(diff);
        }

        BigInteger maxValue= B;
        BigInteger[] valMax = maxValue.divideAndRemainder(Divide);
        BigInteger maxRemainder = valMax[1];
        if(!minRemainder.equals(BigInteger.valueOf(0))){
            maxValue = maxValue.subtract(maxRemainder);
        }

        if(maxValue.compareTo(minValue) == -1){
            return BigInteger.valueOf(0);
        }else {
            BigInteger range = maxValue.subtract(minValue);
            BigInteger countRqw = range.divide(Divide);

            BigInteger countDivNum = countRqw.add(BigInteger.valueOf(1));

            return countDivNum;
        }
    }

    private static BigInteger gcb(BigInteger A, BigInteger B){

        if(A.compareTo(B) == -1){
            BigInteger C = A;
            A = B;
            B = C;
        }

        BigInteger[] valFirst = A.divideAndRemainder(B);
        if(valFirst[1] == BigInteger.valueOf(0)){
            return B;
        }

        while(true){
            BigInteger[] val = A.divideAndRemainder(B);

            if(val[1] == BigInteger.valueOf(0)){
                break;
            }

            BigInteger tmp = B;
            B = val[1];
            A = tmp;
        }

        BigInteger gcb = B;

        return gcb;
    }

    private static BigInteger lcm(BigInteger A, BigInteger B){
        BigInteger lcm = A.multiply(B.divide(gcb(A, B)));
        return lcm;
    }
}
