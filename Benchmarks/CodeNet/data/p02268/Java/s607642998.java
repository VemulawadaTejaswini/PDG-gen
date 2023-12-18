import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    static boolean binarySearch(int[] x, int index, int start, int end) {
        if(start >= end) {
            if(x[start] != index) {
                return false;
            }
        }
        
        int mid = (start + end) / 2;
        
        if(x[mid] == index) {
            return true;
        }else if(x[mid] > index) {
            return binarySearch(x, index, start, mid - 1);
        }else if(x[mid] < index) {
            return binarySearch(x, index, mid + 1, end);
        }
        
        return false; //unreachable
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br_num = new BufferedReader(new InputStreamReader(System.in));
        
        int result = 0;
        
        int num     = Integer.parseInt(br_num.readLine());
        int[] array = new int[num];
        String[] inputs_nums = br_num.readLine().split(" ");
        
        for(int i = 0; i < num; i++) {
            array[i] = Integer.parseInt(inputs_nums[i]);
        }
        
        int q = Integer.parseInt(br_num.readLine());
        String[] inputs_numt = br_num.readLine().split(" ");
        for(String numt : inputs_numt) {
            if(binarySearch(array, Integer.parseInt(numt), 0, num - 1)) {
                result++;
            }
        }
        
        System.out.println(result);
    }
}
