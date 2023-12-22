import java.util.*;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[]d = new int[N];

    for(int i=0; i<N; i++){
        d[i] = sc.nextInt();
}
    ArrayList<Integer>D = new ArrayList<>();    
    for(int i=0; i<N; i++){
        if(!D.contains(d[i])){
            D.add(d[i]);
        }    
    }
		System.out.println(D.size());
    }
}
