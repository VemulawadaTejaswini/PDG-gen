import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int idt[] = new int[26];
        
        while(sc.hasNext()){
            String str = sc.next();
            for(int i=0;i<str.length();i++){
                if(Character.isUpperCase(str.charAt(i))) idt[str.charAt(i)-65]++;
                if(Character.isLowerCase(str.charAt(i))) idt[str.charAt(i)-97]++;
            }
        }
        char c = 'a';
        for(int i=0;i<26;i++){
            System.out.println(c+" : "+idt[i]);
            c++;
        }
    }
}
