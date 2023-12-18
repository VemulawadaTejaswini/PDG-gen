import java.util.Scanner;

class Main{
    static Scanner scan=new Scanner(System.in);
    public static void main(String args[]){
        String s=scan.nextLine();
        String x="";
        int min=99999999,tmp;
        for(int i=0;i+2<s.length();i++){
            x="";
            x+=s.charAt(i);
            x+=s.charAt(i+1);
            x+=s.charAt(i+2);
            //System.out.println(">>"+x);
            tmp=Integer.parseInt(x)-753;
            tmp=Math.abs(tmp);
            if(min>tmp){
                min=tmp;
            }
        }
        System.out.println(min);
    }
}