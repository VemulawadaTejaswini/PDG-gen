import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String[][] sentences = new String[3][3];
        int count = 0;
        for(int i = 0; i < 3; i++){
            String tmp = sc.nextLine();
            for(int j = 0; j < 3; j++){
                sentences[i][j] = String.valueOf(tmp.charAt(j));
                if(count==j){
                 System.out.print(sentences[i][j]);   
                }
            }
            count++;
        }
    }
}