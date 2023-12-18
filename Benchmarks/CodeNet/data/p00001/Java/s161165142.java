public class Main {
    public static void main (String[] args) {
        
        int mount_height[] ={1819,2003,876,2840,1723,1673,3776,2848,1592,922};
        int max_num_1 = mount_height[0];
        int max_num_2 = mount_height[1];
        int max_num_3 = mount_height[2];
        for (int i=0;i<mount_height.length;i++) {
            if (mount_height[i] > max_num_1){
                max_num_3 = max_num_2; 
                max_num_2 = max_num_1; 
                max_num_1 = mount_height[i];
            }
            else if (mount_height[i] > max_num_2){
                max_num_3 = max_num_2; 
                max_num_2 = mount_height[i];
            }
            else if (mount_height[i] > max_num_3){
                max_num_3 = mount_height[i];
            }
        }
        
        System.out.println(max_num_1);
        System.out.println(max_num_2);
        System.out.println(max_num_3);
    }
}