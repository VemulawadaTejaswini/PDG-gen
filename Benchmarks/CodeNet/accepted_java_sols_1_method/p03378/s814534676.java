import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] array = str.split(" ");
        int[] num =new int[3];
        for(int i=0;i<3;i++){
            num[i]=Integer.parseInt(array[i]);
        }
        String str2 = sc.nextLine();       
        String[] array2 = str2.split(" ");
        int[] num2 = new int[num[1]];
        for(int i=0;i<array2.length;i++){
            num2[i]=Integer.parseInt(array2[i]);
        }
        int low=0;
        int high=0;
        for(int i=0;i<array2.length;i++){
            if(num2[i]<num[2]){
                low++;
            }else{
                high++;
            }
        }
        int min=Math.min(low, high);
        System.out.println(min);
    }
}