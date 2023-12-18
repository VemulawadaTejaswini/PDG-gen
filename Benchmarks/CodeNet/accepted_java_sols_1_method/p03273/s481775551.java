import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int row = in.nextInt();
        int col = in.nextInt();
        String [] original = new String[row];
        for(int i = 0; i < row; i++){
            original[i] = in.next();
        }
        //System.out.println("first fase finished");
        List<Integer> delete_row = new ArrayList<>();
        int new_row = row;
        for (int i = 0; i < row; i++){
            boolean delete = true;
            for(int j = 0; j < col; j++){
                if(original[i].charAt(j) == '#'){
                    delete = false;
                    break;
                }
            }
            if (delete){
                delete_row.add(i);
                new_row--;
            }
        }
        //System.out.println(new_row);
        List<Integer> delete_col = new ArrayList<>();
        int new_col = col;
        for (int i = 0; i < col; i++){
            boolean delete = true;
            for (int j = 0; j < row; j++){
                if(original[j].charAt(i) == '#'){
                    delete = false;
                    break;
                }
            }
            if (delete){
                delete_col.add(i);
                new_col--;
            }
        }
        for (int i = 0; i < row; i++){
            String ans = "";
            if (delete_row.contains(i))continue;
            for (int j = 0; j < col; j++){
                if (delete_col.contains(j))continue;
                ans += original[i].charAt(j);
            }
            System.out.println(ans);
        }
    }
    
}