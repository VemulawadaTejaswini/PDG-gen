import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        char compare;
        String in="";
        String input="";
        while(true){
         input=scan.nextLine();
         if(input.equals("")){break;}
         in+=input;
        }
        char[] text=in.toCharArray();
        int count=0;
        
        for(int i=97;i<=122;i++){
            compare=(char)(i);
            count=0;
            for(int j=0;j<text.length;j++){
                if(text[j]==compare||text[j]==Character.toUpperCase(compare)){
                    count+=1;
                }
            }
            System.out.println(compare+" : "+count);
        }
    }
}