import java.util.*;

public class Main {
    public static void main(String args[]) {

        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        String bin = scn.next();
        long count;

        for(int i=0;i<n;i++){

            char[] num;
            num = bin.toCharArray();

            if(num[i]=='1'){
                num[i]='0';
            }else{
                num[i]='1';
            }

            String bin2 = new String (num);


            int dec = Integer.parseInt(bin2, 2);

            int d = dec;
            count =0;

            while(d!=0){
                int c=Integer.bitCount(d);
                d=d%c;
                count +=1;

            }



            System.out.println(count);


        }




        scn.close();

    }


}
