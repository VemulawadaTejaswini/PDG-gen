import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String s=scn.next();
        int min=1000;
        for(int i=0;i<s.length()-2;i++){
            int check=Integer.parseInt(s.substring(i, i+3));
            if(min>Math.abs(check-753)){
                min=Math.abs(check-753);
            }
        }
        System.out.println(min);
    }
}