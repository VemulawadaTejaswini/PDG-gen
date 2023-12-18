import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int member = Integer.parseInt(line);
      	int point =0;
        int[] friend = new int[member];
      	line = sc.nextLine();
       String[] fp = line.split(" ");
      	for(int i=0;i<member;i++){
          friend[i] = Integer.parseInt(fp[i]);
        }
        Arrays.sort(friend);
      	for(int i=1;i<member;i++){
          if(i%2==0){
            point = point + friend[member-(i/2)-1];
          }else{
          	point = point + friend[member-((i-1)/2)-1];
          }
        }
      System.out.println(String.valueOf(point));
    }
}