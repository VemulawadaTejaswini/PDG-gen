import java.io.BufferedReader;
import java.io.*;
public class Main{
    public static int calDim(int[][] array,int begX,int begY,int endX, int endY){
        int maxPoo = array[begX][begY];
        int minSur = array[begX-1][begY-1];
        int sum = 0;
        for (int i = begX; i <= endX; i++){
            for (int j = begY; j <= endY;j ++){
                if (array[i][j] > maxPoo) maxPoo = array[i][j];
            }
        }

        for (int i = begX-1; i <= endX+1;i++){
            for (int j = begY-1;j<=endY+1;j++){
                if ((i<=endX) && (i >= begX) && (j <= endY) && (j >= begY)){

                }else{
                    if(array[i][j] < minSur) minSur = array[i][j];
                }
            }
        }
        if (maxPoo >= minSur){
            return 0;
        }else{
            for (int i = begX; i <= endX; i++){
                for (int j = begY; j <= endY;j ++){
                    sum+= minSur - array[i][j];
                }
            }
            return sum;
        }
    }
    public static void main(String[] args){
        BufferedReader br = null;
        try{
            String curr;
            br = new BufferedReader(new InputStreamReader(System.in));
            while(!(curr = br.readLine()).equals("0 0")){
                String[] input = curr.split(" ");
                int d = Integer.parseInt(input[0]);
                int w = Integer.parseInt(input[1]);
                int[][] array = new int[d][w];
                for (int i = 0;i<d;i++){
                    curr = br.readLine();
                    input = curr.split(" ");
                    for (int j = 0; j<w; j++){
                        array[i][j] = Integer.parseInt(input[j]);
                    }
                }      
                int max = 0;
                for (int i = 1;i < d-1;i++){
                    for (int j = 1; j < w-1;j++){
                        for (int x = i; x < d-1;x++){
                            for (int y = j; y < w-1; y++){
                                int temp = calDim(array,i,j,x,y);
                                if (max < temp) max = temp;
                            }
                        }
                    }
                }    
                System.out.println(max); 
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
