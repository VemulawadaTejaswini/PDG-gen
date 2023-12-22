import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力                                                                                                  
        int N = sc.nextInt();
	int S=0;
	int i,l,r;
	for(i=0;i<N;i++){
            l =	sc.nextInt();
            r =	sc.nextInt();
            S=S + r - l + 1;
        }

        System.out.println(S);
    }
}


