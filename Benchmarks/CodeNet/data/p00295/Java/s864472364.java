import java.util.*;
import java.util.stream.Collectors;

public class Main {

    private static List<Integer> COLOR_LIST = Arrays.asList(1, 2, 3, 4, 5, 6);
    private static List<Integer> UP_SIDE_INDEX = Arrays.asList(0,1,2,3,4,5,6,7,8);
    private static List<Integer> SOUTH_SIDE_INDEX = Arrays.asList(9,10,11);
    private static List<Integer> EAST_SIDE_INDEX = Arrays.asList(12,13,14);
    private static List<Integer> WEST_SIDE_INDEX = Arrays.asList(15,16,17);
    private static List<Integer> NORTH_SIDE_INDEX = Arrays.asList(18,19,20);
    private static List<Integer> DOWN_SIDE_INDEX = Arrays.asList(21,22,23,24,25,26,27,28,29);
    private static List<List<Integer>> SIDE_INDEX_LIST = Arrays.asList(UP_SIDE_INDEX
            ,SOUTH_SIDE_INDEX
            ,EAST_SIDE_INDEX
            ,WEST_SIDE_INDEX
            ,NORTH_SIDE_INDEX
            ,DOWN_SIDE_INDEX
    );

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        List<Integer> resultList = new ArrayList<>();
        for(int i = 0; i < num; i++) {
            String[] input = scanner.nextLine().split(" ");
            //String[] input = new String[]{"1", "1", "1", "1", "1", "1", "1", "1", "1", "2", "2", "2", "4", "4", "4", "6", "6", "6", "5", "5", "5", "3", "3", "3", "3", "3", "3", "3", "3", "3"};
            //String[] input = new String[]{"3", "3", "3", "1", "1", "1", "1", "1", "1", "2", "2", "2", "4", "4", "6", "4", "6", "6", "5", "5", "5", "3", "3", "3", "3", "3", "3", "1", "1", "1"};
            //String[] input = new String[]{"3", "3", "3", "1", "1", "3", "1", "1", "1", "2", "2", "5", "6", "4", "4", "4", "6", "6", "2", "5", "5", "3", "3", "3", "1", "3", "3", "1", "1", "1"};
            //String[] input = new String[]{"1","3","1","3","1","3","3","1","3","2","2","2","6","4","4","6","6","4","5","5","5","1","3","1","1","3","1","3","1","3"};
            List<Integer> initCube = Arrays.asList(input).stream()
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            initCube.add(0);
            List<Integer> result = start(initCube);
            resultList.add(result.get(result.size() -1));
        }

        resultList.forEach(System.out::println);

    }

    private static List<Integer> start(List<Integer> initCube) {
        final Deque<List<Integer>> openQ = new ArrayDeque<>();
        openQ.add(initCube);

        int count = 0;
        while(!openQ.isEmpty() && count < 8) {
            List<Integer> cube = openQ.poll();
            if(currentPoint(cube) == 30) {
                return cube;
            }else{
                cube.set(cube.size() -1, cube.get(cube.size() -1) + 1);
                openQ.add(rotate(Rotation.NORTH, cube));
                openQ.add(rotate(Rotation.EAST, cube));
                openQ.add(rotate(Rotation.SOUTH, cube));
                openQ.add(rotate(Rotation.WEST, cube));
            }
            count++;
        }

        return null;
    }

    private static long currentPoint(List<Integer> cubeTable) {
        long totalPoint = 0;
        for(List<Integer> sideIndex : SIDE_INDEX_LIST) {
            totalPoint += sideIndex.stream()
                    .map(index -> cubeTable.get(index))
                    .collect(Collectors.groupingBy(it -> it, Collectors.counting()))
                    .values()
                    .stream()
                    .max(Comparator.naturalOrder())
                    .get();
        }

        return totalPoint;
    }

    private static void swap(int index1, int index2, List<Integer> cubeTable) {
        index1--;
        index2--;
        int index2Color = cubeTable.get(index2);
        cubeTable.set(index2, cubeTable.get(index1));
        cubeTable.set(index1, index2Color);
    }

    public static List<Integer> rotate(Rotation rotation, List<Integer> srcCube) {
        List<Integer> cubeTable = new ArrayList<>(srcCube);
        Collections.copy(cubeTable, srcCube);
        switch(rotation) {
            case NORTH:
                swap(1, 28, cubeTable);
                swap(2, 29, cubeTable);
                swap(3, 30, cubeTable);
                swap(19, 21, cubeTable);
                swap(15, 16, cubeTable);
                break;
            case SOUTH:
                swap(7, 22, cubeTable);
                swap(8, 23, cubeTable);
                swap(9, 24, cubeTable);
                swap(10, 12, cubeTable);
                swap(13, 18, cubeTable);
                break;
            case EAST:
                swap(3, 22, cubeTable);
                swap(6, 25, cubeTable);
                swap(9, 28, cubeTable);
                swap(13, 15, cubeTable);
                swap(12, 19, cubeTable);
                break;
            case WEST:
                swap(1, 24, cubeTable);
                swap(4, 27, cubeTable);
                swap(7, 30, cubeTable);
                swap(16, 18, cubeTable);
                swap(10, 21, cubeTable);
                break;
        }
        return cubeTable;
    }

    public enum Rotation{
        NORTH,
        SOUTH,
        EAST,
        WEST;
    }

}