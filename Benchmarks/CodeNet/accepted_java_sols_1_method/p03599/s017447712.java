import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double f = sc.nextDouble();
        double baseConcentration = (100 * e) / (100 + e);
        double concentration;
        double maxConcentration = 0;
        int maxSugar = 0;
        int maxSagerWater = 0;
        for(int i = 0; i * a * 100 <= f; i++) {
            for(int j = 0; j * b * 100 <= f; j++) {
                double water = i * a * 100 + j * b * 100;
                for(int k = 0; k * c <= f; k++) {
                    for(int l = 0; l * d <= f; l++) {
                        double sugar = c * k + d * l;
                        double sugarWater = sugar + water;
                        if(sugar ==  0 || water == 0) {
                            concentration = 0;
                        } else {
                            concentration = (100 * sugar) / (sugarWater);
                        }
                        if(sugarWater <= f && concentration <= baseConcentration && concentration >= maxConcentration) {
                            if(water == 0 && sugar != 0) continue;
                            maxConcentration = concentration;
                            maxSugar = (int)sugar;
                            maxSagerWater = (int)sugarWater;
                        }
                    }
                }
            }
        }
        System.out.println(maxSagerWater + " " + maxSugar);
    }
}


