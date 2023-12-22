import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] str = new String[N];
        boolean test = true;
        
        for(int i=0; i<N; i++){
            str[i] = sc.next();
            //System.out.println(str[i]);
            if(i>0){
                //System.out.println(str[i]);
                if(str[i-1].charAt(str[i-1].length()-1)!=str[i].charAt(0)){
                    test = false;
                }
                for(int j=0; j<i; j++){
                    if(str[i].equals(str[j])){
                        test = false;
                    }
                }
            }
            if(!test){
                break;
            }
        }
        if(test){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}