import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char T[] = sc.next().toCharArray();
        for(int i=0;i<T.length-1;i++){
            if(T[i]=='P'&&T[i+1]=='?'){
                T[i+1] = 'D';
            }else if(T[i]=='D'&&T[i+1]=='?'){
                T[i+1] = 'P';
            }
        }
        System.out.println(new String(T));
    }
}
