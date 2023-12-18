import java.util.*;

public class Main {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> V = new ArrayList<>();
        ArrayList<Integer> C = new ArrayList<>();
        int diff = 0;


        for(int i=0; i<n; i++){
            V.add(sc.nextInt());
        }
        for(int i=0; i<n; i++){
            C.add(sc.nextInt());
        }
        for(int i=0; i<n; i++){
            
            if((V.get(i)-C.get(i))>0){
                diff += V.get(i)-C.get(i);
            }            
        }

        System.out.println(diff);

        sc.close();

	}	
}