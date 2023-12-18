
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Main {

    public static void main(String[] args) throws IOException {
        new Main().dominoesArrangement();
    }
    Map<String, Integer> dominoMasterMap;
    String oddLine;
    String evenLine;
    String[] dominoArray;
    List<Integer> sortNoList;

    public void dominoesArrangement() throws IOException {
        //create domino master
        dominoMasterMap = new HashMap<String, Integer>();
        int sortNo = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j <= i; j++) {
                dominoMasterMap.put(String.valueOf(j) + i, sortNo++);
            }
        }

        //read input file
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while ((oddLine = br.readLine()) != null) {
            evenLine = br.readLine();
            dominoArray = evenLine.split(" ");
            for (int i = 0; i < Integer.parseInt(oddLine); i++) {
                //change input no to diamond master
                sortNoList.add(dominoMasterMap.get(dominoArray[i]));
            }

            boolean sortFlg = false;
            Integer pastNo = null;
            for (Integer no : sortNoList) {
                if (no == null) {
                    pastNo = no;
                    continue;
                }
                if (pastNo > no) {
                    sortFlg = true;
                    break;
                }
                pastNo = no;
            }

            //judge is sort no right
            if (sortFlg) {
                System.out.println("YES");
            } else {
                System.out.println("No");
            }
        }
    }
}