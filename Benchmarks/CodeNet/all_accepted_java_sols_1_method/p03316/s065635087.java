import java.util.Scanner;
class Main{
    public static void main(String arg[]){
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
        String s = String.valueOf(n);
        int s_n=0;
        for(int i=0;i<s.length();i++){
            int num=Character.getNumericValue(s.charAt(i));
            s_n+=num;
        }
        if(n%s_n==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}