import java.util.*;

public class Main{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);


        long s = sc.nextLong();


        long x1 = 0;
        long y1 = 0;

        List<Integer> num = new ArrayList<>();

//        for (int i=(int)Math.sqrt(s); i>=0; i--){
//            if (s%i==0){
//                num.add(i);
//                break;
//            }
//        }


        int sqr = 0;
        if (Math.sqrt(s)==(int)Math.sqrt(s)){
            sqr=(int)Math.sqrt(s);
        }else{
            sqr=(int)Math.sqrt(s)+1;
        }



//        int y2 = 1;
//        int x3 = Math.abs((int)diff/1);

//        for (int i=(int)Math.sqrt(s); i>=0; i--){
//            if (s%i==0){
//                num.add(i);
//                break;
//            }
//        }

        long x2 = (long)sqr;
        long y3 = (long)sqr;

        long diff = Math.abs(x2*y3-s);

        long x3 = 1;
        long y2 = diff;

//        long x2 = num.get(num.size()-1);
//        long y2 = 0;
//
//        long x3 = x2;
//        long y3 = s/x2;


        System.out.println(x1+" "+y1+" "+x2+" "+y2+" "+x3+" "+y3);

    }
}