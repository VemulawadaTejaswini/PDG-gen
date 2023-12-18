import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        array arr = new array();
        do {
            String[] frase = in.nextLine().split(" ");
            if (frase[0].equals("insert")) {
                arr.insert(Integer.parseInt(frase[1]));
            } else if (frase[0].equals("extract")) {
                arr.extract();
            } else {
                break;
            }
        } while (true);
    }
}

class array {
    private ArrayList<Integer> heapVector;

    public array() {
        heapVector = new ArrayList<>(2000000);
    }

    public void insert(int key) {
        if (heapVector.size() == 0) {
            heapVector.add(key);
        } else {
            heapVector.add(key);
            heapify(heapVector.size() - 1);
        }
    }

    public void extract(){
        int aux = heapVector.get(0);
        heapVector.set(0, heapVector.get(heapVector.size()-1));
        heapVector.remove(heapVector.size() - 1);
        if(heapVector.size() > 1) {
            heapifyCorrectAll(0);
        }
        System.out.println(aux);
    }

    private void swap(int curr, int changeTo){
        int aux = heapVector.get(curr);
        heapVector.set(curr, heapVector.get(changeTo));
        heapVector.set(changeTo, aux);
    }

    private void heapify(int curr) {
        int father;
        if ((curr != 0) && ((curr % 2) == 0)) {
            father = (curr - 2) / 2;
        } else if((curr % 2) == 1) {
            father = (curr - 1) / 2;
        } else {
            return;
        }

        if (heapVector.get(father) < heapVector.get(curr)) {
            swap(curr, father);
            curr = father;
            if(curr !=0) {
                heapify(curr);
            }
        }
    }

    private void heapifyCorrectAll(int curr) {
        int largest = curr;
        int l = 2 * curr + 1;
        int r = 2 * curr + 2;

        if (l < heapVector.size() && heapVector.get(l) > heapVector.get(largest)) {
            largest = l;
        }
        if (r < heapVector.size() && heapVector.get(r) > heapVector.get(largest)) {
            largest = r;
        }

        if (largest != curr) {
            swap(curr, largest);
            if(largest<heapVector.size()/2) {
                heapifyCorrectAll(largest);
            }
        }
    }
}
