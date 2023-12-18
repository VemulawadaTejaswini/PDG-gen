/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




import java.util.* ;

/**
 *
 * @author nai
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int max = -1;
        int min = 10000;
        
        int N = sc.nextInt();
        for(int i = 0 ; i < N ; i++){
            int temp = sc.nextInt();
            if(max < temp){
                max = temp;
            }
            if(temp < min){
                min = temp;
            }
        }
        
        System.out.println(max - min);
    }
  }
    

