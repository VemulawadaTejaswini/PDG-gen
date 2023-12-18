import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int[] group = new int[scanner.nextInt()];
        int m = scanner.nextInt();
        int groupID = 1;
        Arrays.fill(group, -1);
        for (int i = 0; i < m; i++) {
            int s = scanner.nextInt();
            int t = scanner.nextInt();
            if(group[s]==-1 && group[t]==-1)
                group[s]=group[t]=groupID++;
            else if(group[s]!=-1 && group[t]==-1)
                group[t]=group[s];
            else if(group[s]==-1 && group[t]!=-1)
                group[s]=group[t];
            else{
                int tempID = group[t];
                for(int k=0; k<group.length ;k++)
                    if(group[k]==tempID)
                        group[k]=group[s];
            }
        }
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++)
            if (group[scanner.nextInt()] == group[scanner.nextInt()])
                System.out.println("yes");
            else
                System.out.println("no");
    }
 

}