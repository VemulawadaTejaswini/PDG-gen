import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[] kazu = new int[26];
        Arrays.fill(kazu, 0);
        
        while(sc.hasNext()){
            String str = sc.nextLine();
            for(int i=0;i<str.length();i++){
                int alph = str.toLowerCase().charAt(i) - 'a';
                if((alph>=0)&&(alph<26))
                    kazu[alph]++;
            }    
        }
        
        for(int i=0;i<26;i++){
            System.out.println((char)(i+'a')+":"+kazu[i]);
        }
    }
}