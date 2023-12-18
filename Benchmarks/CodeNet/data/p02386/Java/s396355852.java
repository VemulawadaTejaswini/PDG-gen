import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String[][] cube = new String[n][6];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 6; j++) {
                cube[i][j] = scn.next();
            }
        }
        String ans = "Yes";
        for (int i = 0; i < n; i++) {
            if(ans.equals("No")){
                break;
            }
            for (int j = i + 1; j < n; j++) {

                if (cube[j][0].equals(cube[i][0]) && cube[j][5].equals(cube[i][5])) {
                    String cube1 = cube[i][1] + cube[i][2] + cube[i][4] + cube[i][3];
                    cube1 = cube1 + cube1;
                    String check = cube[j][1] + cube[j][2] + cube[j][4] + cube[j][3];
                    //System.out.println("1");
                    if (cube1.contains(check)) {
                        ans = "No";
                        break;
                    }

                } else if (cube[j][0].equals(cube[i][5]) && cube[j][5].equals(cube[i][0])) {
                    String cube1 = cube[i][3] + cube[i][4] + cube[i][2] + cube[i][1];
                    cube1 = cube1 + cube1;
                    String check = cube[j][1] + cube[j][2] + cube[j][4] + cube[j][3];
                    //System.out.println("2");
                    if (cube1.contains(check)) {
                        ans = "No";
                        break;
                    }

                } else if (cube[j][0].equals(cube[i][1]) && cube[j][5].equals(cube[i][4])) {
                    String cube1 = cube[i][3] + cube[i][5] + cube[i][2] + cube[i][0];
                    cube1 = cube1 + cube1;
                    String check = cube[j][1] + cube[j][2] + cube[j][4] + cube[j][3];
                    //System.out.println("3");
                    if (cube1.contains(check)) {
                        ans = "No";
                        break;
                    }
                } else if (cube[j][0].equals(cube[i][4]) && cube[j][5].equals(cube[i][1])) {
                    String cube1 = cube[i][0] + cube[i][2] + cube[i][5] + cube[i][3];
                    cube1 = cube1 + cube1;
                    String check = cube[j][1] + cube[j][2] + cube[j][4] + cube[j][3];
                    //System.out.println("4");
                    if (cube1.contains(check)) {
                        ans = "No";
                        break;
                    }
                } else if (cube[j][0].equals(cube[i][2]) && cube[j][5].equals(cube[i][3])) {
                    String cube1 = cube[i][0] + cube[i][1] + cube[i][5] + cube[i][4];
                    cube1 = cube1 + cube1;
                    String check = cube[j][1] + cube[j][2] + cube[j][4] + cube[j][3];
                    //System.out.println("5");
                    if (cube1.contains(check)) {
                        ans = "No";
                        break;
                    }
                } else if (cube[j][0].equals(cube[i][3]) && cube[j][5].equals(cube[i][2])) {
                    String cube1 = cube[i][4] + cube[i][5] + cube[i][1] + cube[i][0];
                    cube1 = cube1 + cube1;
                    String check = cube[j][1] + cube[j][2] + cube[j][4] + cube[j][3];
                    //System.out.println("6");
                    if (cube1.contains(check)) {
                        ans = "No";
                        break;
                    }



                }
            }
        }

        System.out.println(ans);


        scn.close();

    }


}

