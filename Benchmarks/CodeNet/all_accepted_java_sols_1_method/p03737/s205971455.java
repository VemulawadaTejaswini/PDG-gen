import java.io.*;

public class Main{

        public static void main(String[] args){


                BufferedReader input1 =
                        new BufferedReader (new InputStreamReader (System.in));

                int num1 = 0;
                try{
                        String Sts = input1.readLine();

                        String[] each = Sts.split(" ",0);

                        String firstSt = each[0].toUpperCase();
                        String secandSt = each[1].toUpperCase();
                        String thirdSt = each[2].toUpperCase();

                        char[] first = firstSt.toCharArray();
                        char[] secand = secandSt.toCharArray();
                        char[] third = thirdSt.toCharArray();



                        char[] answer = new char[3];
                        answer[0] = first[0];
                        answer[1] = secand[0];
                        answer[2] = third[0];

                        String ansSt = String.valueOf(answer);
                        System.out.println(ansSt);

                }catch(Exception e){
                        System.out.println(e);
                }
        }

}