import java.util.Scanner;

public class Main{
    public static Scanner scan  = new Scanner(System.in);
    public static void main(String[]args){
        String s;
        boolean flag;

        flag=false;
        s=next();

        for(int i=0;i<s.length();i++){
            if(i%2==0){
                if(s.charAt(i)=='R'||s.charAt(i)=='U'||s.charAt(i)=='D'){
                    flag=true;
                }
                else{
                    flag=false;
                    break;
                }
            }
            else{
                if(s.charAt(i)=='L'||s.charAt(i)=='U'||s.charAt(i)=='D'){
                    flag=true;
                }
                else{
                    flag=false;
                    break;
                }
            }
        }
        yesNo(flag);
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