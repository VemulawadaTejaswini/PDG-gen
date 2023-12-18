import java.util.*;
class Main{
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j;
        int[] count=new int[26];
        String sentence=" ";
        char basic_c[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        while(sc.hasNext()){
        sentence+=sc.nextLine();
        }
        sentence = sentence.toLowerCase();
        for(i=0; i < sentence.length(); i++){
            for (j = 0; j < basic_c.length; j++) {
                if (sentence.charAt(i)==basic_c[j])
                    count[j]++;
            }
        } 
        for(j = 0; j < basic_c.length; j++){
             System.out.println(basic_c[j]+" : "+count[j]);
        } 
    }
}
