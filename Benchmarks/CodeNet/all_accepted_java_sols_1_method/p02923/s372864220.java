import java.util.*;

public class Main { //クラス名はMain
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
        int[] h=new int[n];
        ArrayList<Integer> a=new ArrayList<>();
        int o=0;
        for (int i=0;i<n;i++){
        	h[i]=sc.nextInt();
            if(i>0 && h[i-1]<h[i]){
            	a.add(i);
            }
        } 
        int l=a.size();
        if(l>0){
            o=a.get(0)-1;
            for (int i=1;i<l;i++){
                int d=a.get(i)-a.get(i-1)-1;
                if(o<d)o=d;
            }
            int d_last=n-1-a.get(l-1);
            if(o<d_last)o=d_last;
        }  else{
        	o=n-1;
        }
        System.out.println(o);
    }
}