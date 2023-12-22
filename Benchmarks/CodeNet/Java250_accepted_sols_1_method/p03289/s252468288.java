import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String s[]=line.split("",0);
        boolean b=true;
        int count=0;
        for(int i=0;i<s.length;i++){
            if(i==0){
                if(!s[i].equals("A")){
                    b=false;
                break;}
                
            }
            
            if(i!=0){
                if(i>=2&&i<=s.length-2&&(s[i].equals("C"))){
                    count++;
                }
                else{
                    char[] c = s[i].toCharArray();
                    if(!((int)c[0]>96&&(int)c[0]<123)){
                        b=false;
                        break;
                    }
                
                }
            }
                
            
        }
        if(count!=1)b=false;
        if(b)System.out.println("AC");
        else System.out.println("WA");
        
    }
}