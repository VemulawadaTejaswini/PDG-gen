import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();
        int[] positions=new int[sc.nextInt()];
        if(m>positions.length)m=positions.length;
        for(int i=0;i<positions.length;i++){
            positions[i]=sc.nextInt();
        }
        Arrays.sort(positions);
        int[] b=new int[positions.length-1];
        for(int i=0;i<b.length;i++){
            b[i]=positions[i+1]-positions[i];
        }
        Arrays.sort(b);
        int tmp=positions[positions.length-1]-positions[0];
        for(int i=0;i<m-1;i++){
            tmp-=b[b.length-1-i];
        }
        System.out.println(tmp);
                
        
        
        
        

}

}