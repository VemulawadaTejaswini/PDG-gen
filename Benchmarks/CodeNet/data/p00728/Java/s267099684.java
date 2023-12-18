import java.io.*;


public class Main {

    public static void main(String[] args) {

        int judger;
        int scores[] = new int[100];
        
    
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
    
        try {
            for(int x = 0; x < 20; x++) {
                int max = 0;
                int min = 1000;
                String str = input.readLine();
                judger = Integer.parseInt(str.trim());
                
                if(judger == 0) {
                    break;
                } else  {
                    for(int i = 0; i < judger; i++){
                        str = input.readLine();
                        scores[i] = Integer.parseInt(str.trim());
                        if(max < scores[i]) {
                            max = scores[i];
                        }
                        if(min > scores[i]) {
                            min = scores[i];
                        }
                    }
                    System.out.println(average(scores, max, min,judger));
                }
            }
        } catch(IOException e) {
            
        }
    }
    
    private static int average(int[] scores,int max,int min,int judger) {
    
    int sum = 0;
    int average;
    
    for(int i=0;i < judger; i++) {
    sum += scores[i];
    }
    average = ( sum - ( min + max )) / (judger - 2);
    
    return average;
    
    }
}