import java.util.*;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int K = sc.nextInt();


    ArrayList<Integer>onaji = new ArrayList<>();
    int cou = 0;    
    int max = Math.max(A,B); 
    for(int i=1; i<=max; i++){
        if(A%i==0 && B%i==0){
        onaji.add(i);
}
}
    Collections.sort(onaji, Collections.reverseOrder());
        System.out.println(onaji.get(K-1));
 }
}