import java.util.*;
public class Main{
    public static void main(String[] args){
        char alph[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        Scanner sc = new Scanner(System.in);
        String str = "";
        while(sc.hasNext()){
            str+=sc.nextLine();
        }
        str=str.toLowerCase();
        int count[] = new int[alph.length];
        for(int i = 0;i < str.length(); i++){
            for(int j = 0; j < alph.length; j++){
                if(str.charAt(i) == alph[j]){
                    count[j]++;
                }
            }
        }
        for(int i = 0; i < alph.length; i++){
            System.out.println(alph[i]+" : "+count[i]);
        }
    }
}
