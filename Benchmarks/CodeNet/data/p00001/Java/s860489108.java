public class Aizu1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner stdIn = new Scanner(System.in);
        int[] mountain_height = new int[10];
        
        for(int j = 0; j<mountain_height.length; j++){
           mountain_height[j] = stdIn.nextInt();
        }
        Arrays.sort(mountain_height);
        
        for(int i=mountain_height.length-1; i>=mountain_height.length-3; i--){
            System.out.println(mountain_height[i]);
        }
     }
    
}