import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<List<Integer>> Array = new ArrayList<>();
        
        int n = sc.nextInt();
        
        for(int i=0;i<n;i++){
            List<Integer> array = new ArrayList<>();
            Array.add(array);
        }
        
        int q = sc.nextInt();
        
        for(int i=0;i<q;i++){
            int a = sc.nextInt();
            
            if(a == 0){
                int t= sc.nextInt();
                int x = sc.nextInt();
                Array.get(t).add(x);
            }else if(a == 1){
                int t = sc.nextInt();
                int k= 0;
                	for(int j : Array.get(t)){
                    	System.out.print(j);
                			k++;
                		if(k != Array.get(t).size())
                            System.out.print(" ");
                    }
                System.out.println();
            }else{
                int t = sc.nextInt();
                Array.get(t).clear();
        	}
        }
    }
}
