import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("S",0);
        map.put("H",1);
        map.put("C",2);
        map.put("D",3);
        char a[] = new char[4];
        a[0] = 'S';
        a[1] = 'H';
        a[2] = 'C';
        a[3] = 'D';
        int card[][] = new int[4][13];
        for(int i = 0 ; i < 4 ; i++)
        {
            for(int j = 0 ; j < 13 ; j++)
                card[i][j] = 0;
        }
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++)
        {
            String key = sc.next();
            int num = sc.nextInt();
            card[map.get(key)][num-1]++;
        }
        for(int i = 0 ; i < 4 ; i++)
        {
            for(int j = 0 ; j < 13 ; j++)
            {
                if(card[i][j] == 0)
                    System.out.println(a[i] + " " + (j+1));
            }
        }
    }
}

