import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int width = 8;
    static int height = 8;
    static int dataNum = 50;
    
    public static void main(String[] args){
        List<int[][]> planeList = readPlane();
        checkPlane(planeList);
    }
    
    static List<int[][]> readPlane(){
        List<int[][]> planeList = new ArrayList<int[][]>();
        //平面の入力をする
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try{
            int count = 0;
            int hCount = 0;
            String line;
            int[][] plane = new int[height][width];
            while(count < dataNum && (line = br.readLine()) != null){
                for(int j = 0; j < width; j++){
                    char c = line.charAt(j);
                    plane[hCount % height][j] = Character.getNumericValue(c);
                }
                if(hCount % height == height - 1){
                    planeList.add(plane);   
                    plane = new int[height][width];
                    br.readLine();  //空白行の読み込み
                    count++;
                }
                hCount++;
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        
        return planeList;
    }
    
    static boolean searchA(int[][] plane){
        for(int i = 0; i < height - 1; i++){
            for(int j = 0; j < width - 1; j++){
                if(plane[i][j] == 1){
                    if(plane[i][j + 1] == 1){
                        if(plane[i + 1][j] == 1){
                            if(plane[i + 1][j + 1] == 1){
                                return true;
                            }
                        }
                    }
                }          
            }
        }
        return false;
    }
    
    static boolean searchB(int[][] plane){
        for(int i = 0; i < height - 3; i++){
            for(int j = 0; j < width; j++){
                if(plane[i][j] == 1){
                    if(plane[i + 1][j] == 1){
                        if(plane[i + 2][j] == 1){
                            if(plane[i + 3][j] == 1){
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    static boolean searchC(int[][] plane){
        for(int i = 0; i < height; i++){
            for(int j = 0; j < width - 3; j++){
                if(plane[i][j] == 1){
                    if(plane[i][j + 1] == 1){
                        if(plane[i][j + 2] == 1){
                            if(plane[i][j + 3] == 1){
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    static boolean searchD(int[][] plane){
        for(int i = 0; i < height - 2; i++){
            for(int j = 1; j < width; j++){
                if(plane[i][j] == 1){
                    if(plane[i + 1][j - 1] == 1){
                        if(plane[i + 1][j] == 1){
                            if(plane[i + 2][j - 1] == 1){
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    static boolean searchE(int[][] plane){
        for(int i = 0; i < height - 1; i++){
            for(int j = 0; j < width - 2; j++){
                if(plane[i][j] == 1){
                    if(plane[i][j + 1] == 1){
                        if(plane[i + 1][j + 1] == 1){
                            if(plane[i + 1][j + 2] == 1){
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    static boolean searchF(int[][] plane){
        for(int i = 0; i < height - 2; i++){
            for(int j = 0; j < width - 1; j++){
                if(plane[i][j] == 1){
                    if(plane[i + 1][j] == 1){
                        if(plane[i + 1][j + 1] == 1){
                            if(plane[i + 2][j + 1] == 1){
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    static boolean searchG(int[][] plane){
        for(int i = 0; i < height - 1; i++){
            for(int j = 1; j < width - 1; j++){
                if(plane[i][j] == 1){
                    if(plane[i][j + 1] == 1){
                        if(plane[i + 1][j - 1] == 1){
                            if(plane[i + 1][j] == 1){
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    static void checkPlane(List<int[][]> planeList){
           //Aから順番に見ていく
        for(int i = 0; i < planeList.size(); i++){
            if(searchA(planeList.get(i))){
                System.out.println("A");
                continue;
            }
            
            if(searchB(planeList.get(i))){
                System.out.println("B");
                continue;
            }
            
            if(searchC(planeList.get(i))){
               System.out.println("C");
               continue;
            }
            
            if(searchD(planeList.get(i))){
                System.out.println("D");
                continue;
            }
            
            if(searchE(planeList.get(i))){
                System.out.println("E");
                continue;
            }
            
            if(searchF(planeList.get(i))){
                System.out.println("F");
                continue;
            }
            
            if(searchG(planeList.get(i))){
                System.out.println("G");
                continue;
            }
        }
    }
}

