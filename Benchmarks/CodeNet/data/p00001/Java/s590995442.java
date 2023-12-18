import java.util.Arrays;

class ListOfTopHills{
    public static void main(String[] args) {
            int[] input = new int[10];
            for(int i=0; i<args.length; i++){
                input[i] = Integer.parseInt(args[i]);
            }    
            Arrays.sort(input);
            System.out.println(input[7]);
            System.out.println(input[8]);
            System.out.println(input[9]);
    }
}
