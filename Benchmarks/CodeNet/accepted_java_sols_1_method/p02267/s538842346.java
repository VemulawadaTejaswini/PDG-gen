import java.util.*;
//import java.util.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);
    int n;
    int q;
    int i,j;
    int count = 0;
    
    n = sc.nextInt();
    int N[] = new int[n];
    for(i = 0; i < n; i++){
        N[i] = sc.nextInt();
    }
    
    q = sc.nextInt();
    int Q[] = new int[q];
    for(i = 0; i < q; i++){
        Q[i] = sc.nextInt();
    }

    for(i = 0; i < q; i++){
        for(j = 0; j < n; j++){
            if(N[j] == Q[i]){
                count++;
                break;
            }
        }
    }
    System.out.println(count);
    
    
    

    }

}

