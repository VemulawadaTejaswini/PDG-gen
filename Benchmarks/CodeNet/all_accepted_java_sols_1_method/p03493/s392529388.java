import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int cnt=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1'){
                cnt++;
            }
        }
        System.out.print(cnt+"\n");
    }
}