import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int member = Integer.parseInt(line);
      	long point =0;
        long[] friend = new long[member];
      
      	line = sc.nextLine();
        String[] fp = line.split(" ");
      
      	for(int i=1;i<member;i++){
          friend[i] = Long.parseLong(fp[i]);
        }
      
        Arrays.sort(friend);
      
      	for(int k=1;k<member;k++){
            if(k%2 ==0){
              point = point + friend[(member-1)-(k/2)];
            }else{
              point = point + friend[(member-1)-((k-1)/2)];
            }
        }
      System.out.println(String.valueOf(point));
    }
}