import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc =new Scanner(System.in);
        
        int a[]=new int[26];
        
        while(sc.hasNextLine()){
        
        String S = sc.nextLine();
        
        for(int i = 0; i < S.length(); i++) {
        
		 char c = S.charAt(i);
		 
		 if('a'<= c&&c<='z')
          a[c-'a']++;
          
          if('A'<= c&&c<='Z')
          a[c-'A']++;
         
         }
         
         }
            
        for(int i=0;i<26;i++)    
        System.out.printf("%c : %d\n",'a'+i,a[i]);
}
}
