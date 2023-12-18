import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class Main {
    private static final Reader reader = new Reader();
    private static final int MAX = 100000;
    public static void main(String[] args) throws Exception{
        int n = reader.readInt();
        int[] nums = reader.readIntArray();
        int totXor = 0;
        for(int i=0;i<n;i++){
            totXor^=nums[i];
        }
        for(int i=0;i<n;i++){
            System.out.print((totXor^nums[i])+" ");
        }
    }


    private static class Reader{
        private final BufferedReader br;
        public Reader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        public int readInt() throws Exception{
            return Integer.parseInt(br.readLine());
        }
        public long readLong() throws Exception {
            return Long.parseLong(br.readLine());
        }
        public double readDouble() throws Exception {
            return Double.parseDouble(br.readLine());
        }
        public String readLine() throws Exception{
            return br.readLine();
        }
        public int[] readIntArray() throws Exception{
            String[] tokens = br.readLine().split(" ");
            int[] nums = new int[tokens.length];
            for(int i=0;i<tokens.length;i++){
                nums[i] = Integer.parseInt(tokens[i]);
            }
            return nums;
        }
        public long[] readLongArray() throws Exception{
            String[] tokens = br.readLine().split(" ");
            long[] nums = new long[tokens.length];
            for(int i=0;i<tokens.length;i++){
                nums[i] = Long.parseLong(tokens[i]);
            }
            return nums;
        }
        public double[] readDoubleArray() throws Exception {
            String[] tokens = br.readLine().split(" ");
            double[] nums = new double[tokens.length];
            for(int i=0;i<tokens.length;i++){
                nums[i] = Double.parseDouble(tokens[i]);
            }
            return nums;
        }
        public String[] readWords() throws Exception {
            return br.readLine().split(" ");
        }
    }
}