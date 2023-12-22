import java.util.Scanner;
public class Main{
    public static Scanner scan  = new Scanner(System.in);
    public static void main(String[]args){
        String [] abc = new String[3];
        abc[0]=next();
        abc[1]=next();
        abc[2]=next();
        int[] i_abc={0,0,0};
        int now=0;
        char tmp;

        while/*(
            i_abc[0]<=abc[0].length()&&
            i_abc[1]<=abc[1].length()&&
            i_abc[2]<=abc[2].length()
            )*/
            (true)
        {

            if(i_abc[now]<abc[now].length()) tmp=abc[now].charAt(i_abc[now]);
            else break;
            i_abc[now]+=1;
            switch (tmp){
                case 'a':
                    now=0;
                    break;
                case 'b':
                    now=1;
                    break;
                case 'c':
                    now=2;
                    break;
            }
        }
        /*
        if(i_abc[0]>=abc[0].length()) print('A');
        else if(i_abc[1]>=abc[1].length()) print('B');
        else if(i_abc[2]>=abc[2].length()) print('C');
        */
        switch(now){
            case 0:
                print("A");
                break;
            case 1:
                print("B");
                break;
            case 2:
                print("C");
                break;
        }
    }



    public static int nextInt(){
        return Integer.parseInt(scan.next());
    }
    public static long nextLong(){
        return Long.parseLong(scan.next());
    }
    public static String next(){
        return scan.next();
    }
    public static double nextDouble(){
        return Double.parseDouble(scan.next());
    }
    public static float nextFloat(){
        return Float.parseFloat(scan.next());
    }

    //Yes or No
    public static void yesNo(boolean flag){
        if(flag) System.out.println("Yes");
        else System.out.println("No");
    }
    public static void print(Object a){
        System.out.println(a);
    }
}
