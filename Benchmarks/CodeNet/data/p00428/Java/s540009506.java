import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main{
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            while(true){
                //initialize
                String[] inits = br.readLine().split(" " , 2);
                int people = Integer.valueOf(inits[0]);
                int questions = Integer.parseInt(inits[1]);

                if(people != 0 && questions != 0){
                    //initialize
                    int[] score = new int[questions];

                    for(int i = 0; i < people; i++){
                        String[] answers = br.readLine().split(" " , questions);
                        for(int j = 0; j < questions; j++){
                            if(answers[j].equals("1")){
                                score[j]++;
                            }
                        }
                    }

                for(int i = people; i >= 0; i--){
                    for(int j = 0; j < questions; j++){
                        if(score[j] == i){
                            System.out.print((j+1) + " ");
                        }
                    }
                }
                System.out.println();

                }else break;
            }
        }catch(IOException e){
            System.out.println("Error!");
        }
    }
}