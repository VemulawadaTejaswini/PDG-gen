import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int m = sc.nextInt();
        
        int[] rows = new int[h];
        int[] cols = new int[w];
        
        Set<String> mines = new HashSet<>();
        
        for(int i = 0; i<m ; i++) {
          int x = sc.nextInt();
          int y = sc.nextInt();
          
          x--;
          y--;
          mines.add(Arrays.toString(new int[] {x,y}));
          rows[x]++;
          cols[y]++;
        }
        
        int out = 0;
        
        int rowmax = rows[0]; int x = 0;
        for(int i = 1; i<h; i++) {
          if(rows[i] > rowmax) {
            rowmax = rows[i];
            x = i;
          }
        }
        int colmax = cols[0]; int y = 0;
        for(int i = 1; i<w; i++) {
          if(cols[i] > colmax) {
            colmax = cols[i];
            y = i;
          }
        }
        
        out = rowmax + colmax;
        if(mines.contains(Arrays.toString(new int[] {x,y})))
          out--;
        
        System.out.println(out);
    }
}