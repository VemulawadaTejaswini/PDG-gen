import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        int n=Integer.parseInt(line[0]);
        int k=Integer.parseInt(line[1]);

        String[] line1 = sc.nextLine().split(" ");
    
        int[] num=new int[n];
        for(int i=0;i<n;i++){
          num[i]=Integer.parseInt(line1[i]);
        }

        List<Integer> list=new ArrayList<Integer>();

        for(int i=0;i<k;i++){
          list.add(num[i]);
        } 
        for(int i=k;i<n;i++){
          if(num[i]<Collections.max(list)){
            list.add(num[i]);
            list.remove(Collections.max(list));
          }
        }
        int sum=0;

        for(int value:list){
          sum=sum+value;
        }

          System.out.println(sum);
    }
  
}


