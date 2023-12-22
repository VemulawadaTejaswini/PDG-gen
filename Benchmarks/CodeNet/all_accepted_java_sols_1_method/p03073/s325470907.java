import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            String S = sc.next();
        sc.close();
        
        String[] Sarray = new String[S.length()]; 
        String[] M = new String[S.length()]; 
        int count = 0 ;
        for(int i = 0 ; i < S.length(); i++){
            Sarray[i] = String.valueOf(S.charAt(i));
        }

        for(int i = 0 ; i < S.length(); i++){
            if(i%2 == 0){
                M[i] = "1";
            }else{
                M[i] = "0";
            }
            if(Sarray[i].equals(M[i])){
                count++;
            }
        }
        //System.out.println(count);

        if(S.length() - count < count){
            System.out.println(S.length() - count);
        }else{
            System.out.println(count);
        }
    }
}