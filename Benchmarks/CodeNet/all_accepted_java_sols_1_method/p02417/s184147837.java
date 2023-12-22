import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int i;
        Scanner sc= new Scanner(System.in);
        String sarr1="";

        while(sc.hasNext()){
            String sarr2=sc.nextLine();
            if(sarr2.length()==0){
                break;
            }
            sarr1 += sarr2;
        }
        
        String sarr=sarr1.toLowerCase();

        int num[]=new int[26];

        for(i=0;i<sarr.length();i++){
            if(sarr.charAt(i) - 'a'>=0 && sarr.charAt(i) - 'a'<26){
                num[sarr.charAt(i)-'a']++;
            }
        }

        for(i=0;i<26;i++){
            System.out.printf("%c : %d\n",'a'+i,num[i]);
        }
        sc.close();
    }    
}
