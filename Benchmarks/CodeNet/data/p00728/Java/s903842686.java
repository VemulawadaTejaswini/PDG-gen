import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        for(int m = 0; m < 20; m++) {
            int numA = sc.nextInt();
            if(numA!=0) {
                int foo[] = new int[numA];
                int av[] = new int[numA-2];
                for(int i = 0; i < numA ; i++) {
                    foo[i] = sc.nextInt();
                }
                int max = foo[0];
                int min = foo[0];

                for(int i = 0; i < numA ; i++) {
                    if(max < foo[i]) {
                        max = foo[i];
                    }
                    if(min > foo[i])
                        min = foo[i];
                }

                int count = 0;
                int countMax = 0;
                int countMin = 0;
                for(int i = 0; i < numA; i++) {
                    if(foo[i] == max) {
                        if(countMax == 0) {
                            countMax++;
                        }else {
                            av[count] = foo[i];
                            count++;
                        }
                    }else if(foo[i] == min){
                        if(countMin == 0) {
                            countMin++;
                        }else {
                            av[count] = foo[i];
                            count++;
                        }
                    }else {
                        av[count] = foo[i];
                        count++;
                    }
                }

                int sum = 0;
                for(int i = 0; i< av.length; i++) {
                    sum += av[i];
                }
                System.out.println(sum/av.length);
            }
            else {
                break;
            }
        }
    }


}
